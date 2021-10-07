import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminGuard } from './auth/admin.guard';
import { AuthGuard } from './auth/auth.guard';
import { DashboardComponent } from './dashboard/dashboard.component';
import { InicioComponent } from './inicio/inicio/inicio.component';
import { MantProfesorComponent } from './mant-profesor/mant-profesor.component';





const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch:'full' },
  { path: 'inicio', component: InicioComponent },
  { path: 'home', component: DashboardComponent, canActivate:[AuthGuard] },
  { path: 'admin', component: MantProfesorComponent, canActivate:[AdminGuard] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})



export class AppRoutingModule { }
