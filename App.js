import React, { Component } from 'react';
import { Router, Scene } from 'react-native-router-flux';


import Inicio from './src/components/Inicio';
import home from './src/components/home';

export default class App extends Component {
  render() {
    return (


      <Router titleStyle={{ Color: '#fff' }}>
        <Scene navigationBarStyle={{ backgroundColor: '#fff' }} hideNavBar={true} key='inicio' component={Inicio} />
        <Scene navigationBarStyle={{ backgroundColor: '#3CB371' }}
          key='home' component={home} hideNavBar={false} title="Bem Vindo" />
      </Router>

    );
  }
}