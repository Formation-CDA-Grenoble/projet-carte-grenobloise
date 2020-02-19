import React, { Component } from 'react';
import Axios from 'axios';

class infosForm extends Component {
  state = {
    infos: {
      mayorname: '',
      habitantsnumber: '',
      area: '',
      tramlines: 0,
      
    },
  }

  handleChange = (event) => {
    const { infos } = this.state;
    infos[event.target.mayorname] = event.target.value;
    this.setState({infos });
  }

  handleSubmit = (event) => {
    const { infos } = this.state;
    // Empêche la page de se recharger (comportement normale lors de la validation d'un formulaire)
    event.preventDefault();
    // Envoie le contenu du formulaire pour créer un nouveau produit
    Axios.post('http://localhost:3000/api/infos', infos)
    .then(response => console.log(response))
    .catch(error => console.error(error));
  }

  render() {
    const { mayorname, habitantsNumber, area, tramlines } = this.state.infos;

    return (
      <form onSubmit={this.handleSubmit}>
        <label for="mayorname">infos mayorname</label>
        <input type="text" name="mayorname" value={name} onChange={this.handleChange} />
        <label for="habitantsNumber">habitantsNumber</label>
        <input type="number" name="habitantsNumber" value={habitantsNumber} onChange={this.handleChange} />
        <label for="area">area/label>
        <input type="number" name="area" value={price} onChange={this.handleChange} />
        <input type="text" name="tramlines" value={0} />
        <input type="send" />
      </form>
    );
  }
}

export default ProductForm;