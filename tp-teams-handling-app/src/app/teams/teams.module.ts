import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatCardModule} from "@angular/material/card";
import {TeamDetailPageComponent} from "@team-handling/teams/containers/team-detail-page/team-detail-page.component";
import {TeamListPageComponent} from "@team-handling/teams/containers/team-list-page/team-list-page.component";
import {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import { TeamAddPageComponent } from './containers/team-add-page/team-add-page.component';
import {ReactiveFormsModule} from "@angular/forms";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";


@NgModule({
  declarations: [TeamListPageComponent, TeamDetailPageComponent, TeamAddPageComponent],
  exports: [
    TeamListPageComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatFormFieldModule,
    MatInputModule,
  ]
})
export class TeamsModule { }
