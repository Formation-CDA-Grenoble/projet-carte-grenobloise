import {component} from 'react';
import Axios from 'axios';
import infos from './infos';

class container extends component {
    state = {
        data: null,
    };
    componentDiMount() {
        Axios.get('http://localhost:3000/api/infos/3')
	    .then(response => this.setState({ data: response.data }))
	    .catch(error => console.error(error));
	  }
	

	  render() {
	    return <infosform {...this.state.data} />;
	  }
	}
	

	export default Container;


    
