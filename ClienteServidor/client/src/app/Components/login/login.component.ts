import { Component, OnInit } from '@angular/core';
import { UsuarioInterface } from 'src/app/Models/usuarioInteface';
import { Router } from '@angular/router';

import { UsuariosService } from 'src/app/Services/usuarios.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  //Variables para el ingreso del usuairo
  nombreUsuario: string = "";
  passwordUsuario: string = "";
  //Arreglo para los usuario
  datosUsuarios: UsuarioInterface[] = [];

  constructor(private usuariosService: UsuariosService, public router: Router) { }

  ngOnInit(): void {
    this.CargarDatos();
  }

  CargarDatos(){
    this.usuariosService.CargarDatosUsuarios().subscribe(async (res) =>
    {
      let datos: any = res;
      this.datosUsuarios = datos;
      //console.log("LISTADO DE USUARIOS: ");
      //console.log(this.datosUsuarios);
    },
    err => console.log(err));
  }

  Login(){
    if(this.nombreUsuario != "" && this.passwordUsuario != "") {
      for (const usuario of this.datosUsuarios) {
        if (usuario.Usuario == this.nombreUsuario && usuario.Password == this.passwordUsuario){
          this.usuariosService.setUsuarioActual(usuario);
          this.router.navigate(['paginaPrincipal']);
          break;
        }
      }
    } else {

    }
  }

}
