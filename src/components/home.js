import React, { Component } from 'react';
import { View, StyleSheet } from 'react-native';
import { TabViewAnimated, TabBar, SceneMap } from 'react-native-tab-view';

const Agricola= () => (<View style={[styles.container, { backgroundColor: '#ff4081' }]} />);
const Pecuaria = () => (<View style={[styles.container, { backgroundColor: '#673ab7' }]} />);

export default class home extends Component {
    state = {
        index: 0,
        routes: [
            { key: '1', title: 'Agricola' },
            { key: '2', title: 'Pecuaria' }
        ],
    };

    _handleChangeTab = index => this.setState({ index });
    _renderHeader = props => <TabBar {...props} />;

    _renderScene = SceneMap({
        '1': Agricola,
        '2':Pecuaria
    });

    render() {
        return (
            <TabViewAnimated
                style={styles.container}
                navigationState={this.state}
                renderScene={this._renderScene}
                renderHeader={this._renderHeader}
                onRequestChangeTab={this._handleChangeTab}
            />
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
    },

});