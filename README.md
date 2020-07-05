# react-native-native-logger

## Getting started

Purpose of this package is to read javascript logs from the native output in release or debug builds as well as to learn how to even make an npm module

`$ yarn add react-native-native-logger`

### Mostly automatic installation

`$ react-native link react-native-native-logger`

The linking is for android only as there is no native iOS code

## Usage

```javascript
import NativeLogger from "react-native-native-logger";

NativeLogger.log("Your message here");
```

### Logging levels

iOS

- debug: info
- release: error

Android

- debug: info
- release: info
