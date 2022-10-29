import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { UsuarioInterface } from '../Models/usuarioInteface';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  API_URI = 'http://localhost:3000/usuarios';

  constructor(private http: HttpClient) { }

  headers: HttpHeaders = new HttpHeaders({
    "Content-Type": "application/json"
  })

  CargarDatosUsuarios(){
    return this.http.get(`${this.API_URI}/todos`);
  }

  setUsuarioActual(usuario: UsuarioInterface){
    let username_string = JSON.stringify(usuario);
    localStorage.setItem('UsuarioLogeado', username_string);
  }

  getUsuarioActual(){
    let usernameActual = localStorage.getItem('UsuarioLogeado');
    if (usernameActual) {
      let username_json = JSON.parse(usernameActual);
      return username_json;
    } else {
      return null;
    }
  }

  eliminarUsuarioActual(){
    localStorage.removeItem('UsuarioLogeado');
  }


}
