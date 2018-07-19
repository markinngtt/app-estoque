import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

import { LoginComponent } from './login.component';
import { LoginRouting } from './login.routing';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { UsuarioService} from '../_services/usuario.service';
import { MaterialModule } from '../material.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
    imports: [
      CommonModule,
      LoginRouting,
      RouterModule,
      ReactiveFormsModule,
      FormsModule,
      MaterialModule,
      BrowserAnimationsModule
    ],
    declarations: [
      LoginComponent
    ],
    providers: [
        UsuarioService
    ]
  })
  export class LoginModule { }