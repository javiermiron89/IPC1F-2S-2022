import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';

import { UsuariosService } from 'src/app/Services/usuarios.service';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent implements OnInit {

  constructor(private usuarioService: UsuariosService, public router: Router) { }

  ngOnInit(): void {
  }

  CerrarSesion() {
    this.usuarioService.eliminarUsuarioActual();
    this.router.navigate(['login']);
  }

}
