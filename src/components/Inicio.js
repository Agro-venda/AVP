import React, { Component } from 'react';
import { StyleSheet, Text, View, Image, TouchableOpacity, StatusBar } from 'react-native';

import {Actions} from 'react-native-router-flux';

const logo = require('../img/venda2.png');
//const acesso = require('../img/botao.png');

export default class Incio extends Component {

    render() {
        return (
            <View style={styles.container}>

                <StatusBar
                    backgroundColor="#fff"
                    barStyle="light-content"
                />

                <View style={styles.img}>
                    <Image source={logo} />
                </View>
                <TouchableOpacity
                
                onPress={() => {Actions.home(); }} 
                
                style={styles.botao}>

                    <Text style={styles.textoBotao}> Entrar</Text>

                </TouchableOpacity>



            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        backgroundColor: '#fff',
        paddingVertical: 10,
        paddingHorizontal: 50,
    },
    botao: {
        backgroundColor: '#2d723c',
        paddingVertical: 10,
        paddingHorizontal: 50,
        marginTop: 20,
        borderColor: '#fff',
        borderWidth: 2,
        borderRadius: 10,
        justifyContent: 'center',
        alignItems: 'center'
    },
    textoBotao: {
        justifyContent: 'center',
        alignItems: 'center',
        color: '#fff',
        fontSize: 16,
        fontWeight: 'bold'

    },

    img: {
        justifyContent: 'center',
        alignItems: 'center'
    }
});
