import React, {Component} from 'react';
import './App.css';
import { PostList } from './Components/PostList';

// const api = axios.create({
//   baseURL: 'http://localhost:3000'
// })


class App extends Component {  
  
 render(){
	 return(
		 <div className="App">
			<PostList/>
		 </div>
	 )
 }
}

export default App;
  //ReactDOM.render(<App />, document.querySelector('#app'));
  
