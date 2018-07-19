import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

import { HomeComponent } from './home.component';
import { HomeRouting } from './home.routing';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BrowserModule } from '@angular/platform-browser';
import { MaterialModule } from '../material.module';

@NgModule({
    imports: [
      CommonModule,
      HomeRouting,
      RouterModule,
      ReactiveFormsModule,
      FormsModule,
      BrowserModule,
      BrowserAnimationsModule,
      MaterialModule
    ],
    declarations: [
        HomeComponent
    ],
    providers: [
        
    ]
  })
  export class HomeModule { }