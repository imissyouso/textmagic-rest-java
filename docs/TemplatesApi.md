# TemplatesApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](TemplatesApi.md#createTemplate) | **POST** /api/v2/templates | Create a new template from the submitted data.
[**deleteTemplate**](TemplatesApi.md#deleteTemplate) | **DELETE** /api/v2/templates/{id} | Delete a single template.
[**deleteTemplatesBulk**](TemplatesApi.md#deleteTemplatesBulk) | **POST** /api/v2/templates/delete | Delete template by given ID(s) or delete all templates.
[**getAllTemplates**](TemplatesApi.md#getAllTemplates) | **GET** /api/v2/templates | Get all user templates.
[**getTemplate**](TemplatesApi.md#getTemplate) | **GET** /api/v2/templates/{id} | Get a single template.
[**searchTemplates**](TemplatesApi.md#searchTemplates) | **GET** /api/v2/templates/search | Find user templates by given parameters.
[**updateTemplate**](TemplatesApi.md#updateTemplate) | **PUT** /api/v2/templates/{id} | Update existing template.


<a name="createTemplate"></a>
# **createTemplate**
> ResourceLinkResponse createTemplate(createTemplateInputObject, xIgnoreNullValues)

Create a new template from the submitted data.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
CreateTemplateInputObject createTemplateInputObject = new CreateTemplateInputObject(); // CreateTemplateInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.createTemplate(createTemplateInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#createTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTemplateInputObject** | [**CreateTemplateInputObject**](CreateTemplateInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(id)

Delete a single template.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteTemplate(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#deleteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteTemplatesBulk"></a>
# **deleteTemplatesBulk**
> deleteTemplatesBulk(deleteTemplatesBulkInputObject, xIgnoreNullValues)

Delete template by given ID(s) or delete all templates.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
DeleteTemplatesBulkInputObject deleteTemplatesBulkInputObject = new DeleteTemplatesBulkInputObject(); // DeleteTemplatesBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteTemplatesBulk(deleteTemplatesBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#deleteTemplatesBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteTemplatesBulkInputObject** | [**DeleteTemplatesBulkInputObject**](DeleteTemplatesBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllTemplates"></a>
# **getAllTemplates**
> GetAllTemplatesResponse getAllTemplates(page, limit)

Get all user templates.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetAllTemplatesResponse result = apiInstance.getAllTemplates(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#getAllTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional]
 **limit** | **Integer**| How many results to return | [optional]

### Return type

[**GetAllTemplatesResponse**](GetAllTemplatesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplate"></a>
# **getTemplate**
> MessageTemplate getTemplate(id)

Get a single template.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
Integer id = 1; // Integer | 
try {
    MessageTemplate result = apiInstance.getTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#getTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchTemplates"></a>
# **searchTemplates**
> SearchTemplatesResponse searchTemplates(page, limit, ids, name, content)

Find user templates by given parameters.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String ids = "ids_example"; // String | Find template by ID(s)
String name = "name_example"; // String | Find template by name
String content = "content_example"; // String | Find template by content
try {
    SearchTemplatesResponse result = apiInstance.searchTemplates(page, limit, ids, name, content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#searchTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **ids** | **String**| Find template by ID(s) | [optional]
 **name** | **String**| Find template by name | [optional]
 **content** | **String**| Find template by content | [optional]

### Return type

[**SearchTemplatesResponse**](SearchTemplatesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTemplate"></a>
# **updateTemplate**
> ResourceLinkResponse updateTemplate(updateTemplateInputObject, id, xIgnoreNullValues)

Update existing template.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TemplatesApi apiInstance = new TemplatesApi();
UpdateTemplateInputObject updateTemplateInputObject = new UpdateTemplateInputObject(); // UpdateTemplateInputObject | 
Integer id = 1; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.updateTemplate(updateTemplateInputObject, id, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#updateTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateTemplateInputObject** | [**UpdateTemplateInputObject**](UpdateTemplateInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

