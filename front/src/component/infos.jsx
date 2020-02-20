import React from 'react';

const infos = (props) =>
  <div>
    <h1>{props.mayorname}</h1>
    <div>Habitantsnumber: {props.habitantsnumber}</div>
    <div>area: {props.area}</div>
    <div>tramlines: {props.tramlines}</div>
  </div>
;

export default infos;