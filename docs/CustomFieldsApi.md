# CustomFieldsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomField**](CustomFieldsApi.md#createCustomField) | **POST** /api/v2/customfields | Create a new custom field from the submitted data.
[**deleteCustomField**](CustomFieldsApi.md#deleteCustomField) | **DELETE** /api/v2/customfields/{id} | Delete a single custom field.
[**getCustomField**](CustomFieldsApi.md#getCustomField) | **GET** /api/v2/customfields/{id} | Get a single custom field.
[**getCustomFields**](CustomFieldsApi.md#getCustomFields) | **GET** /api/v2/customfields | Get all contact custom fields.
[**updateCustomField**](CustomFieldsApi.md#updateCustomField) | **PUT** /api/v2/customfields/{id} | Update existing custom field.
[**updateCustomFieldValue**](CustomFieldsApi.md#updateCustomFieldValue) | **PUT** /api/v2/customfields/{id}/update | Update contact&#39;s custom field value.


<a name="createCustomField"></a>
# **createCustomField**
> ResourceLinkResponse createCustomField(createCustomFieldInputObject, xIgnoreNullValues)

Create a new custom field from the submitted data.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CustomFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CustomFieldsApi apiInstance = new CustomFieldsApi();
CreateCustomFieldInputObject createCustomFieldInputObject = new CreateCustomFieldInputObject(); // CreateCustomFieldInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.createCustomField(createCustomFieldInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldsApi#createCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCustomFieldInputObject** | [**CreateCustomFieldInputObject**](CreateCustomFieldInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomField"></a>
# **deleteCustomField**
> deleteCustomField(id)

Delete a single custom field.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CustomFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CustomFieldsApi apiInstance = new CustomFieldsApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteCustomField(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldsApi#deleteCustomField");
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

<a name="getCustomField"></a>
# **getCustomField**
> UserCustomField getCustomField(id)

Get a single custom field.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CustomFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CustomFieldsApi apiInstance = new CustomFieldsApi();
Integer id = 1; // Integer | 
try {
    UserCustomField result = apiInstance.getCustomField(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldsApi#getCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**UserCustomField**](UserCustomField.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomFields"></a>
# **getCustomFields**
> GetCustomFieldsResponse getCustomFields(page, limit)

Get all contact custom fields.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CustomFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CustomFieldsApi apiInstance = new CustomFieldsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetCustomFieldsResponse result = apiInstance.getCustomFields(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldsApi#getCustomFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetCustomFieldsResponse**](GetCustomFieldsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomField"></a>
# **updateCustomField**
> ResourceLinkResponse updateCustomField(updateCustomFieldInputObject, id, xIgnoreNullValues)

Update existing custom field.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CustomFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CustomFieldsApi apiInstance = new CustomFieldsApi();
UpdateCustomFieldInputObject updateCustomFieldInputObject = new UpdateCustomFieldInputObject(); // UpdateCustomFieldInputObject | 
Integer id = 1; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.updateCustomField(updateCustomFieldInputObject, id, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldsApi#updateCustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCustomFieldInputObject** | [**UpdateCustomFieldInputObject**](UpdateCustomFieldInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomFieldValue"></a>
# **updateCustomFieldValue**
> ResourceLinkResponse updateCustomFieldValue(updateCustomFieldValueInputObject, id, xIgnoreNullValues)

Update contact&#39;s custom field value.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.CustomFieldsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

CustomFieldsApi apiInstance = new CustomFieldsApi();
UpdateCustomFieldValueInputObject updateCustomFieldValueInputObject = new UpdateCustomFieldValueInputObject(); // UpdateCustomFieldValueInputObject | 
String id = "id_example"; // String | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.updateCustomFieldValue(updateCustomFieldValueInputObject, id, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomFieldsApi#updateCustomFieldValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCustomFieldValueInputObject** | [**UpdateCustomFieldValueInputObject**](UpdateCustomFieldValueInputObject.md)|  |
 **id** | **String**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

