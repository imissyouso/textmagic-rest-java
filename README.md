# TextMagic Java SDK
This library provides you with an easy solution to send SMS and receive replies by integrating TextMagic SMS Gateway to your Java application.

## What is TextMagic?
TextMagic's application programming interface (API) provides the communication link between your application and TextMagic’s SMS Gateway, allowing you to send and receive text messages and to check the delivery status of text messages you’ve already sent.

For detailed documentation and more examples, please visit [http://docs.textmagictesting.com/](http://docs.textmagictesting.com/)

## Requirements

1. Java 1.7+
2. Maven/Gradle

## Installation

### Maven

Add this dependency to your project's POM:
```xml
<dependencies>
    <dependency>
        <groupId>com.textmagic.sdk</groupId>
        <artifactId>textmagic-java-sdk</artifactId>
        <version>2.0.212</version>
    </dependency>
</dependencies>
```

### Gradle

Add this dependency to your project's build file:
```groovy
compile "com.textmagic.sdk:textmagic-java-sdk:2.0.212"
```

## Usage Example

```java
import com.textmagic.sdk.*;
import com.textmagic.sdk.api.TextMagicApi;
import com.textmagic.sdk.auth.*;
import com.textmagic.sdk.model.*;

public class App {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR_USERNAME");
        BasicAuth.setPassword("YOUR_PASSWORD");

        TextMagicApi apiInstance = new TextMagicApi();

        try {
            SendMessageInputObject sendMessageInputObject = new SendMessageInputObject();
            sendMessageInputObject.setText("I love Textmagic!");
            sendMessageInputObject.setPhones("+19998887766");

            SendMessageResponse response = apiInstance.sendMessage(sendMessageInputObject, true);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling sendMessage");
            e.printStackTrace();
        }
    }
}
```

## License
The library is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).