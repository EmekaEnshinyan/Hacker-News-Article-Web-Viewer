import axios from 'axios'
import React, {Component} from 'react'

export class PostList extends Component {
   
    constructor(props){
        super(props)
        this.state = {
            posts: Object
        }
    }

//A test API endpoint -> https://hacker-news.firebaseio.com/v0/item/29042728.json?print=pretty
    componentDidMount(){
        axios.get('http://localhost:8080/hn/articles')
        .then(response => {
            console.log(response)
            this.setState({posts: response.data})
        })
        .catch(error => {
            console.log(error)
        })
            
        }
    
    render(){
       const {posts} = this.state
        return(
            <div>
               <h1>Hacker News: Article Data</h1>
               <p>{posts.by}</p>
               <p>{posts.descendants}</p>
               <p>{posts.id}</p>
               <p>{posts.kids}</p>
               <p>{posts.score}</p>
               <p>{posts.time}</p>
               <p>{posts.title}</p>
               <p>{posts.type}</p>
               <p>{posts.url}</p>
            </div>
        )
    }
}
