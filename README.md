# TextMagic Java SDK

JavaScript client for TextMagic API

For detailed documentation, please visit [http://docs.textmagictesting.com/](http://docs.textmagictesting.com/)

## Installation

```shell
npm install  --save
```

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
    rules: [
        {
            parser: {
                amd: false
            }
        }
    ]
}
```

## Usage Example

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
const textmagicClient = require('textmagic-client');

const client = textmagicClient.ApiClient.instance;
const auth = client.authentications['BasicAuth'];

auth.username = 'YOUR_USERNAME';
auth.password = 'YOUR_PASSWORD';

const api = new textmagicClient.TextMagicApi();

api.sendMessage({
    'text': 'I love TextMagic!',
    'phones': '+12341234123'
}).then(function (data) {
    console.log(data);
}).catch(function(err){
    console.error(err);
});
```