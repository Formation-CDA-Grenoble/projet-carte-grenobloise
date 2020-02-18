import React; {component} from 'react';
import Axios from 'axios';

class contactForm extends components
{
    state = {
        contact : {
            name : "";
            firstname : "";
            email : "";
        },
        }
        handlechange = (event) => {
            const {contact} = this.state;
            contact [event.target.name] = eventthis.setState({contact});target value}
            handlesend = (event) => {
                const {contact} = this.state;
                event.preventDefault();
                Axios.post ('http : //localhost : 8080/api/contact', contact)
                .then (response => console.log(response))
                .catch (error => console.error (error));
            }
            render({
                const {name, first, email} this.state.contact;
                return(
                    <form onsubmit = {this.handlesubmit}>
                    <label for = "name">contact name</label>
                    <input type = "text" name = "name", value {name} onchange = {this.handlechange}/>
                    <label for = "firstname">contact firstname</label>
                    <input type = "text" name = "firstname" value = {firstname} onchange = {this.handlechange}/>
                    <label for = "email">email</label>
                    input type = "text" name = "email" value = {email} onchange = {this.handlechange}/>
                    /</form>
                )
            }
            export.default contactform;
        }
    }
}