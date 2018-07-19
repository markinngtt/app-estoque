import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { trigger, state, style, transition, animate } from '@angular/animations';
import { HttpErrorResponse } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
    selector: 'HomeComponent',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.css'],    
    encapsulation: ViewEncapsulation.None
})
export class HomeComponent implements OnInit {
    usuario: String;

    constructor(private router: Router) { }

    ngOnInit(){
       this.usuario = localStorage.getItem('usuario');
    }

    Logout(){
        this.router.navigate(['/login']);
    }
}