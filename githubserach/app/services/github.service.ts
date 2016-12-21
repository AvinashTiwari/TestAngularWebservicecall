import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class GitHubService{
    private username:string;
    private clinet_id ="241790076554853f5537";
    private clinet_secret = "cf2f8eba54e331265f1b840d15b12b059ee19d36";

    constructor(private _http: Http)
    {
        console.log("Githib service ready");
        this.username = "AvinashTiwari";
    }

    getUser()
    {
        return this._http.get("http://api.github.com/users/" + this.username + "?clinet_id="+this.clinet_id + "&client_secret="+this.clinet_secret).map(res => res.json());
    }

     getRepos()
    {
        return this._http.get("http://api.github.com/users/" + this.username + "/repos?clinet_id="+this.clinet_id + "&client_secret="+this.clinet_secret).map(res => res.json());
    }

    updateUser(username:string)
    {
        this.username = username;
    }
}