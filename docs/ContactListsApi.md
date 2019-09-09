# ContactListsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignContactsToList**](ContactListsApi.md#assignContactsToList) | **PUT** /api/v2/lists/{id}/contacts | Assign contacts to the specified list.
[**clearAndAssignContactsToList**](ContactListsApi.md#clearAndAssignContactsToList) | **POST** /api/v2/lists/{id}/contacts | Reset list members to the specified contacts.
[**createList**](ContactListsApi.md#createList) | **POST** /api/v2/lists | Create a new list from the submitted data.
[**deleteContactsFromList**](ContactListsApi.md#deleteContactsFromList) | **DELETE** /api/v2/lists/{id}/contacts | Unassign contacts from the specified list.
[**deleteList**](ContactListsApi.md#deleteList) | **DELETE** /api/v2/lists/{id} | Delete a single list.
[**deleteListAvatar**](ContactListsApi.md#deleteListAvatar) | **DELETE** /api/v2/lists/{id}/avatar | Delete an avatar for the list.
[**deleteListContactsBulk**](ContactListsApi.md#deleteListContactsBulk) | **POST** /api/v2/lists/{id}/contacts/delete | Delete contact from list by given ID(s) or all contacts from list.
[**deleteListsBulk**](ContactListsApi.md#deleteListsBulk) | **POST** /api/v2/lists/delete | Delete list by given ID(s) or delete all lists.
[**getContactsByListId**](ContactListsApi.md#getContactsByListId) | **GET** /api/v2/lists/{id}/contacts | Fetch user contacts by given group id.
[**getList**](ContactListsApi.md#getList) | **GET** /api/v2/lists/{id} | Get a single list.
[**getListContactsIds**](ContactListsApi.md#getListContactsIds) | **GET** /api/v2/lists/{id}/contacts/ids | Fetch all contacts IDs belonging to the list with ID.
[**getListsOfContact**](ContactListsApi.md#getListsOfContact) | **GET** /api/v2/contacts/{id}/lists | Return lists which contact belongs to.
[**getUserLists**](ContactListsApi.md#getUserLists) | **GET** /api/v2/lists | Get all user lists.
[**searchLists**](ContactListsApi.md#searchLists) | **GET** /api/v2/lists/search | Find contact lists by given parameters.
[**updateList**](ContactListsApi.md#updateList) | **PUT** /api/v2/lists/{id} | Update existing list.
[**uploadListAvatar**](ContactListsApi.md#uploadListAvatar) | **POST** /api/v2/lists/{id}/avatar | Add an avatar for the list.


<a name="assignContactsToList"></a>
# **assignContactsToList**
> ResourceLinkResponse assignContactsToList(assignContactsToListInputObject, id)

Assign contacts to the specified list.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
AssignContactsToListInputObject assignContactsToListInputObject = new AssignContactsToListInputObject(); // AssignContactsToListInputObject | Contact ID(s), separated by comma or 'all' to add all contacts belonging to the current user
Integer id = 1; // Integer | 
try {
    ResourceLinkResponse result = apiInstance.assignContactsToList(assignContactsToListInputObject, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#assignContactsToList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignContactsToListInputObject** | [**AssignContactsToListInputObject**](AssignContactsToListInputObject.md)| Contact ID(s), separated by comma or &#39;all&#39; to add all contacts belonging to the current user |
 **id** | **Integer**|  |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearAndAssignContactsToList"></a>
# **clearAndAssignContactsToList**
> ResourceLinkResponse clearAndAssignContactsToList(clearAndAssignContactsToListInputObject, id)

Reset list members to the specified contacts.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
ClearAndAssignContactsToListInputObject clearAndAssignContactsToListInputObject = new ClearAndAssignContactsToListInputObject(); // ClearAndAssignContactsToListInputObject | Contact ID(s), separated by comma or 'all' to add all contacts belonging to the current user
Integer id = 1; // Integer | 
try {
    ResourceLinkResponse result = apiInstance.clearAndAssignContactsToList(clearAndAssignContactsToListInputObject, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#clearAndAssignContactsToList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clearAndAssignContactsToListInputObject** | [**ClearAndAssignContactsToListInputObject**](ClearAndAssignContactsToListInputObject.md)| Contact ID(s), separated by comma or &#39;all&#39; to add all contacts belonging to the current user |
 **id** | **Integer**|  |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createList"></a>
# **createList**
> ResourceLinkResponse createList(createListInputObject, xIgnoreNullValues)

Create a new list from the submitted data.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
CreateListInputObject createListInputObject = new CreateListInputObject(); // CreateListInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.createList(createListInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#createList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createListInputObject** | [**CreateListInputObject**](CreateListInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContactsFromList"></a>
# **deleteContactsFromList**
> deleteContactsFromList(deleteContacsFromListObject, id)

Unassign contacts from the specified list.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
DeleteContacsFromListObject deleteContacsFromListObject = new DeleteContacsFromListObject(); // DeleteContacsFromListObject | Contact ID(s), separated by comma
Integer id = 1; // Integer | 
try {
    apiInstance.deleteContactsFromList(deleteContacsFromListObject, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#deleteContactsFromList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteContacsFromListObject** | [**DeleteContacsFromListObject**](DeleteContacsFromListObject.md)| Contact ID(s), separated by comma |
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteList"></a>
# **deleteList**
> deleteList(id)

Delete a single list.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteList(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#deleteList");
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

<a name="deleteListAvatar"></a>
# **deleteListAvatar**
> deleteListAvatar(id)

Delete an avatar for the list.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteListAvatar(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#deleteListAvatar");
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
 - **Accept**: application/json

<a name="deleteListContactsBulk"></a>
# **deleteListContactsBulk**
> deleteListContactsBulk(deleteListContactsBulkInputObject, id, xIgnoreNullValues)

Delete contact from list by given ID(s) or all contacts from list.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
DeleteListContactsBulkInputObject deleteListContactsBulkInputObject = new DeleteListContactsBulkInputObject(); // DeleteListContactsBulkInputObject | 
Integer id = 1; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteListContactsBulk(deleteListContactsBulkInputObject, id, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#deleteListContactsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteListContactsBulkInputObject** | [**DeleteListContactsBulkInputObject**](DeleteListContactsBulkInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteListsBulk"></a>
# **deleteListsBulk**
> deleteListsBulk(deleteListsBulkInputObject, xIgnoreNullValues)

Delete list by given ID(s) or delete all lists.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
DeleteListsBulkInputObject deleteListsBulkInputObject = new DeleteListsBulkInputObject(); // DeleteListsBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteListsBulk(deleteListsBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#deleteListsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteListsBulkInputObject** | [**DeleteListsBulkInputObject**](DeleteListsBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getContactsByListId"></a>
# **getContactsByListId**
> GetContactsByListIdResponse getContactsByListId(id, page, limit, orderBy, direction)

Fetch user contacts by given group id.

A useful synonym for \&quot;contacts/search\&quot; command with provided \&quot;listId\&quot; parameter.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
Integer id = 1; // Integer | Given group Id.
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
try {
    GetContactsByListIdResponse result = apiInstance.getContactsByListId(id, page, limit, orderBy, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#getContactsByListId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Given group Id. |
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, firstName, lastName]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetContactsByListIdResponse**](GetContactsByListIdResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getList"></a>
# **getList**
> Group getList(id)

Get a single list.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
Integer id = 1; // Integer | 
try {
    Group result = apiInstance.getList(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#getList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Group**](Group.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getListContactsIds"></a>
# **getListContactsIds**
> GetListContactsIdsResponse getListContactsIds(id)

Fetch all contacts IDs belonging to the list with ID.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
Integer id = 1; // Integer | 
try {
    GetListContactsIdsResponse result = apiInstance.getListContactsIds(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#getListContactsIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**GetListContactsIdsResponse**](GetListContactsIdsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getListsOfContact"></a>
# **getListsOfContact**
> GetListsOfContactResponse getListsOfContact(id, page, limit)

Return lists which contact belongs to.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
Integer id = 1; // Integer | 
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetListsOfContactResponse result = apiInstance.getListsOfContact(id, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#getListsOfContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetListsOfContactResponse**](GetListsOfContactResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserLists"></a>
# **getUserLists**
> GetUserListsResponse getUserLists(page, limit, orderBy, direction, favoriteOnly, onlyMine)

Get all user lists.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
Integer favoriteOnly = 0; // Integer | Return only favorite lists
Integer onlyMine = 0; // Integer | Return only current user lists
try {
    GetUserListsResponse result = apiInstance.getUserLists(page, limit, orderBy, direction, favoriteOnly, onlyMine);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#getUserLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, firstName, lastName]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]
 **favoriteOnly** | **Integer**| Return only favorite lists | [optional] [default to 0]
 **onlyMine** | **Integer**| Return only current user lists | [optional] [default to 0]

### Return type

[**GetUserListsResponse**](GetUserListsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchLists"></a>
# **searchLists**
> SearchListsResponse searchLists(page, limit, ids, query, onlyMine, onlyDefault, orderBy, direction)

Find contact lists by given parameters.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String ids = "\"1,2,3,4\""; // String | Find lists by ID(s)
String query = "\"A\""; // String | Find lists by specified search query
Integer onlyMine = 0; // Integer | Return only current user lists
Integer onlyDefault = 0; // Integer | Return only default lists
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
try {
    SearchListsResponse result = apiInstance.searchLists(page, limit, ids, query, onlyMine, onlyDefault, orderBy, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#searchLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **ids** | **String**| Find lists by ID(s) | [optional]
 **query** | **String**| Find lists by specified search query | [optional]
 **onlyMine** | **Integer**| Return only current user lists | [optional] [default to 0]
 **onlyDefault** | **Integer**| Return only default lists | [optional] [default to 0]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, firstName, lastName]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]

### Return type

[**SearchListsResponse**](SearchListsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateList"></a>
# **updateList**
> ResourceLinkResponse updateList(id, updateListObject)

Update existing list.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
Integer id = 1; // Integer | 
UpdateListObject updateListObject = new UpdateListObject(); // UpdateListObject | 
try {
    ResourceLinkResponse result = apiInstance.updateList(id, updateListObject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#updateList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **updateListObject** | [**UpdateListObject**](UpdateListObject.md)|  | [optional]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadListAvatar"></a>
# **uploadListAvatar**
> ResourceLinkResponse uploadListAvatar(image, id)

Add an avatar for the list.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactListsApi apiInstance = new ContactListsApi();
File image = new File("/path/to/file.txt"); // File | List avatar. Should be PNG or JPG file not more than 10 MB
Integer id = 1; // Integer | 
try {
    ResourceLinkResponse result = apiInstance.uploadListAvatar(image, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactListsApi#uploadListAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| List avatar. Should be PNG or JPG file not more than 10 MB |
 **id** | **Integer**|  |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

