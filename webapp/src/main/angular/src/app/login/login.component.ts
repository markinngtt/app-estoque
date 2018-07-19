import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { UsuarioService } from '../_services/usuario.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { trigger, state, style, transition, animate } from '@angular/animations';
import { HttpErrorResponse } from '@angular/common/http';
import { Usuario} from '../_models/usuario'
import { Router } from '@angular/router';

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css'],
    encapsulation: ViewEncapsulation.None
})

export class LoginComponent implements OnInit{

    public usuarioGlobal: String;
    public usuarioConsultado: any;

    mensagem: String;

    usuario: Usuario = new Usuario();

    public loginForm: FormGroup;

    constructor(private usuarioService: UsuarioService,
                private router: Router) { }

    ngOnInit(){
        localStorage.clear();
        this.createLoginForm();
    }

    private createLoginForm() {
        this.loginForm = new FormGroup({
           nome: new FormControl(null, Validators.required),
           senha: new FormControl(null, Validators.required),
           mensagem: new FormControl(null, Validators.required)
       });
     }

    getUsuario(nome, senha){
        console.log("inicio get usuario - nome: "+nome+" senha: "+senha)
        
        this.usuarioService.getUsuario(nome,senha).subscribe((data: any) => {
            this.usuarioConsultado = data;
            localStorage.setItem('usuario', data.usuario);
            this.router.navigate(['/home'])
            console.log("depois de chamar o serviço - "+data)
        }, (err: HttpErrorResponse) => {
            this.mensagem = err.error.message;
            console.log("erro na busca de usuario: "+err.message);
            console.log("erro na busca de usuario variavel: "+this.mensagem);
        });
    }
    
}
