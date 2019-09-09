# SurveysApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelSurvey**](SurveysApi.md#cancelSurvey) | **PUT** /api/v2/surveys/{id}/cancel | Cancel a survey.
[**createSurvey**](SurveysApi.md#createSurvey) | **POST** /api/v2/surveys | Create a new survey from the submitted data.
[**createSurveyNode**](SurveysApi.md#createSurveyNode) | **POST** /api/v2/surveys/{id}/nodes | Create a new node from the submitted data.
[**deleteSurvey**](SurveysApi.md#deleteSurvey) | **DELETE** /api/v2/surveys/{id} | Delete a survey.
[**deleteSurveyNode**](SurveysApi.md#deleteSurveyNode) | **DELETE** /api/v2/surveys/nodes/{id} | Delete a node.
[**duplicateSurvey**](SurveysApi.md#duplicateSurvey) | **PUT** /api/v2/surveys/{id}/duplicate | Duplicate a survey.
[**getSurvey**](SurveysApi.md#getSurvey) | **GET** /api/v2/surveys/{id} | Get a survey by id.
[**getSurveyNode**](SurveysApi.md#getSurveyNode) | **GET** /api/v2/surveys/nodes/{id} | Get a node by id.
[**getSurveyNodes**](SurveysApi.md#getSurveyNodes) | **GET** /api/v2/surveys/{id}/nodes | Fetch nodes by given survey id.
[**getSurveys**](SurveysApi.md#getSurveys) | **GET** /api/v2/surveys | Get all user surveys.
[**mergeSurveyNodes**](SurveysApi.md#mergeSurveyNodes) | **POST** /api/v2/surveys/nodes/merge | Merge two question nodes.
[**resetSurvey**](SurveysApi.md#resetSurvey) | **PUT** /api/v2/surveys/{id}/reset | Reset a survey flow.
[**startSurvey**](SurveysApi.md#startSurvey) | **PUT** /api/v2/surveys/{id}/start | Start a survey.
[**updateSurvey**](SurveysApi.md#updateSurvey) | **PUT** /api/v2/surveys/{id} | Update existing survey.
[**updateSurveyNode**](SurveysApi.md#updateSurveyNode) | **PUT** /api/v2/surveys/nodes/{id} | Update existing node.


<a name="cancelSurvey"></a>
# **cancelSurvey**
> ResourceLinkResponse cancelSurvey(id)

Cancel a survey.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer id = 1; // Integer | 
try {
    ResourceLinkResponse result = apiInstance.cancelSurvey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#cancelSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSurvey"></a>
# **createSurvey**
> ResourceLinkResponse createSurvey(createSurveyInputObject, xIgnoreNullValues)

Create a new survey from the submitted data.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
CreateSurveyInputObject createSurveyInputObject = new CreateSurveyInputObject(); // CreateSurveyInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.createSurvey(createSurveyInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#createSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSurveyInputObject** | [**CreateSurveyInputObject**](CreateSurveyInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSurveyNode"></a>
# **createSurveyNode**
> ResourceLinkResponse createSurveyNode(createSurveyNodeInputObject, id, xIgnoreNullValues)

Create a new node from the submitted data.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
CreateSurveyNodeInputObject createSurveyNodeInputObject = new CreateSurveyNodeInputObject(); // CreateSurveyNodeInputObject | 
Integer id = 1; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.createSurveyNode(createSurveyNodeInputObject, id, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#createSurveyNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSurveyNodeInputObject** | [**CreateSurveyNodeInputObject**](CreateSurveyNodeInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSurvey"></a>
# **deleteSurvey**
> deleteSurvey(id)

Delete a survey.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteSurvey(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#deleteSurvey");
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

<a name="deleteSurveyNode"></a>
# **deleteSurveyNode**
> deleteSurveyNode(id)

Delete a node.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteSurveyNode(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#deleteSurveyNode");
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

<a name="duplicateSurvey"></a>
# **duplicateSurvey**
> ResourceLinkResponse duplicateSurvey(id)

Duplicate a survey.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer id = 1; // Integer | 
try {
    ResourceLinkResponse result = apiInstance.duplicateSurvey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#duplicateSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSurvey"></a>
# **getSurvey**
> Survey getSurvey(id)

Get a survey by id.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer id = 1; // Integer | 
try {
    Survey result = apiInstance.getSurvey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#getSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Survey**](Survey.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSurveyNode"></a>
# **getSurveyNode**
> SurveyNode getSurveyNode(id)

Get a node by id.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer id = 1; // Integer | 
try {
    SurveyNode result = apiInstance.getSurveyNode(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#getSurveyNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**SurveyNode**](SurveyNode.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSurveyNodes"></a>
# **getSurveyNodes**
> GetSurveyNodesResponse getSurveyNodes(id)

Fetch nodes by given survey id.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer id = 1; // Integer | 
try {
    GetSurveyNodesResponse result = apiInstance.getSurveyNodes(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#getSurveyNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**GetSurveyNodesResponse**](GetSurveyNodesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSurveys"></a>
# **getSurveys**
> GetSurveysResponse getSurveys(page, limit)

Get all user surveys.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetSurveysResponse result = apiInstance.getSurveys(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#getSurveys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetSurveysResponse**](GetSurveysResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mergeSurveyNodes"></a>
# **mergeSurveyNodes**
> mergeSurveyNodes(mergeSurveyNodesInputObject, xIgnoreNullValues)

Merge two question nodes.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
MergeSurveyNodesInputObject mergeSurveyNodesInputObject = new MergeSurveyNodesInputObject(); // MergeSurveyNodesInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.mergeSurveyNodes(mergeSurveyNodesInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#mergeSurveyNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mergeSurveyNodesInputObject** | [**MergeSurveyNodesInputObject**](MergeSurveyNodesInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="resetSurvey"></a>
# **resetSurvey**
> ResourceLinkResponse resetSurvey(id)

Reset a survey flow.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer id = 1; // Integer | 
try {
    ResourceLinkResponse result = apiInstance.resetSurvey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#resetSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startSurvey"></a>
# **startSurvey**
> ResourceLinkResponse startSurvey(id)

Start a survey.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
Integer id = 1; // Integer | 
try {
    ResourceLinkResponse result = apiInstance.startSurvey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#startSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSurvey"></a>
# **updateSurvey**
> ResourceLinkResponse updateSurvey(updateSurveyInputObject, id, xIgnoreNullValues)

Update existing survey.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
UpdateSurveyInputObject updateSurveyInputObject = new UpdateSurveyInputObject(); // UpdateSurveyInputObject | 
Integer id = 1; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.updateSurvey(updateSurveyInputObject, id, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#updateSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateSurveyInputObject** | [**UpdateSurveyInputObject**](UpdateSurveyInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSurveyNode"></a>
# **updateSurveyNode**
> ResourceLinkResponse updateSurveyNode(updateSurveyNodeInputObject, id, xIgnoreNullValues)

Update existing node.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.SurveysApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

SurveysApi apiInstance = new SurveysApi();
UpdateSurveyNodeInputObject updateSurveyNodeInputObject = new UpdateSurveyNodeInputObject(); // UpdateSurveyNodeInputObject | 
Integer id = 1; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.updateSurveyNode(updateSurveyNodeInputObject, id, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveysApi#updateSurveyNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateSurveyNodeInputObject** | [**UpdateSurveyNodeInputObject**](UpdateSurveyNodeInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

