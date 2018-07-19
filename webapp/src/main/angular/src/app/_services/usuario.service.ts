import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class UsuarioService {

  public ip = 'http://localhost:8080/api/usuario';

  private url = {
      urlConsultaUsuario: this.ip + '/consulta-usuario'
  };

  constructor (private http: HttpClient) { }

  getUsuario(nome, senha){
      return this.http.get(this.url.urlConsultaUsuario+"/"+nome+"/"+senha);
  }


}

