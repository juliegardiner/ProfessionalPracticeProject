import { Component, OnInit } from '@angular/core';
import { MovieService } from 'src/app/Services/movie.service';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  constructor(private service: MovieService) { }
  list:any;
  public videofile: File=null;
  public imgfile: File=null;

  onImgFileSelected(event){
    this.service.onImgFileSelected(event);
  }
  
  onVideoFileSelected(event){
    this.service.onVideoFileSelected(event);
  }
  
  onAddMovie(form: NgForm){
    
    if (form.valid){
      this.service.addMovie(form.value.movieID, form.value.movieTitle, form.value.movieDesc,form.value.movieReleaseYear, form.value.directorID) 
      .subscribe(()=>{console.log("Movie inserted Successfully.")
        });
        console.log(form.value);
       form.resetForm();
       } else {
         return;
       }
      }

  ngOnInit() {
  }

}
