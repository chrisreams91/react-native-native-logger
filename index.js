import { NativeModules, Platform } from "react-native";

const PREFIX = "NativeLogger";
class NativeLogger {
  log(message) {
    if (Platform.OS === "ios") {
      if (__DEV__) {
        console.log(`${PREFIX} : ${JSON.stringify(message)}`);
      } else {
        console.error(`${PREFIX} : ${JSON.stringify(message)}`);
      }
    } else {
      NativeModules.NativeLogger.log(PREFIX, JSON.stringify(message));
    }
  }
}

export default new NativeLogger();
