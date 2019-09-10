# TextMagic Java SDK

Java client for TextMagic API

For detailed documentation, please visit [http://docs.textmagictesting.com/](http://docs.textmagictesting.com/)

## Installation

### Maven configuration

```java
<dependencies>
    <dependency>
        <groupId>com.textmagic.sdk</groupId>
        <artifactId>textmagic-java-sdk</artifactId>
        <version>2.0.212</version>
    </dependency>
</dependencies>
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