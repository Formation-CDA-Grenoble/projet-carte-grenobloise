import React {component} from 'react';
import Axiox from 'axios';
import infos from './infos';
import Axios from 'axios';


class containers extends component {
    state = {
        data: null,

    };
}

componentDiMount() {
    Axios.get ('http:// localhost : 8080/api/infos/3')
    .then(response => this.setState({data.response.data}))
    .catch(error => console.error(error));
}
render () {
    return <data.Form {...thisstate.data} />;
}
export default containers;