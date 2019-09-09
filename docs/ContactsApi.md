# ContactsApi

All URIs are relative to *http://my.textmagic.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blockContact**](ContactsApi.md#blockContact) | **POST** /api/v2/contacts/block | Block contact from inbound and outbound communication by phone number.
[**createContact**](ContactsApi.md#createContact) | **POST** /api/v2/contacts | Create a new contact from the submitted data.
[**deleteAllContacts**](ContactsApi.md#deleteAllContacts) | **DELETE** /api/v2/contact/all | Delete all contacts.
[**deleteContact**](ContactsApi.md#deleteContact) | **DELETE** /api/v2/contacts/{id} | Delete a single contact.
[**deleteContactAvatar**](ContactsApi.md#deleteContactAvatar) | **DELETE** /api/v2/contacts/{id}/avatar | Delete an avatar for the contact.
[**deleteContactsByIds**](ContactsApi.md#deleteContactsByIds) | **POST** /api/v2/contacts/delete | Delete contact by given ID(s) or delete all contacts.
[**getBlockedContacts**](ContactsApi.md#getBlockedContacts) | **GET** /api/v2/contacts/block/list | Get blocked contacts.
[**getContact**](ContactsApi.md#getContact) | **GET** /api/v2/contacts/{id} | Get a single contact.
[**getContactByPhone**](ContactsApi.md#getContactByPhone) | **GET** /api/v2/contacts/phone/{phone} | Get a single contact by phone number.
[**getContactIfBlocked**](ContactsApi.md#getContactIfBlocked) | **GET** /api/v2/contacts/block/phone | Check is that phone number blocked
[**getContacts**](ContactsApi.md#getContacts) | **GET** /api/v2/contacts | Get all user contacts.
[**getContactsAutocomplete**](ContactsApi.md#getContactsAutocomplete) | **GET** /api/v2/contacts/autocomplete | Get contacts autocomplete suggestions by given search term.
[**getFavourites**](ContactsApi.md#getFavourites) | **GET** /api/v2/contacts/favorite | Get favorite contacts and lists.
[**getUnsubscribedContact**](ContactsApi.md#getUnsubscribedContact) | **GET** /api/v2/unsubscribers/{id} | Get a single unsubscribed contact.
[**getUnsubscribers**](ContactsApi.md#getUnsubscribers) | **GET** /api/v2/unsubscribers | Get all contact have unsubscribed from your communication.
[**searchContacts**](ContactsApi.md#searchContacts) | **GET** /api/v2/contacts/search | Find user contacts by given parameters.
[**unblockContact**](ContactsApi.md#unblockContact) | **POST** /api/v2/contacts/unblock | Unblock contact by phone number.
[**unblockContactsBulk**](ContactsApi.md#unblockContactsBulk) | **POST** /api/v2/contacts/unblock/bulk | Unblock several contacts by blocked contact ids or unblock all contacts
[**unsubscribeContact**](ContactsApi.md#unsubscribeContact) | **POST** /api/v2/unsubscribers | Unsubscribe contact from your communication by phone number.
[**updateContact**](ContactsApi.md#updateContact) | **PUT** /api/v2/contacts/{id} | Update existing contact.
[**uploadContactAvatar**](ContactsApi.md#uploadContactAvatar) | **POST** /api/v2/contacts/{id}/avatar | Add an avatar for the contact.


<a name="blockContact"></a>
# **blockContact**
> ResourceLinkResponse blockContact(blockContactInputObject, xIgnoreNullValues)

Block contact from inbound and outbound communication by phone number.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
BlockContactInputObject blockContactInputObject = new BlockContactInputObject(); // BlockContactInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.blockContact(blockContactInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#blockContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockContactInputObject** | [**BlockContactInputObject**](BlockContactInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createContact"></a>
# **createContact**
> ResourceLinkResponse createContact(createContactInputObject, xIgnoreNullValues)

Create a new contact from the submitted data.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
CreateContactInputObject createContactInputObject = new CreateContactInputObject(); // CreateContactInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.createContact(createContactInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createContactInputObject** | [**CreateContactInputObject**](CreateContactInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllContacts"></a>
# **deleteAllContacts**
> deleteAllContacts()

Delete all contacts.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
try {
    apiInstance.deleteAllContacts();
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteAllContacts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteContact"></a>
# **deleteContact**
> deleteContact(id)

Delete a single contact.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
Integer id = 1; // Integer | 
try {
    apiInstance.deleteContact(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteContact");
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

<a name="deleteContactAvatar"></a>
# **deleteContactAvatar**
> deleteContactAvatar(id)

Delete an avatar for the contact.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
Integer id = 56; // Integer | 
try {
    apiInstance.deleteContactAvatar(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteContactAvatar");
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

<a name="deleteContactsByIds"></a>
# **deleteContactsByIds**
> deleteContactsByIds(deleteContactsByIdsInputObject, xIgnoreNullValues)

Delete contact by given ID(s) or delete all contacts.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
DeleteContactsByIdsInputObject deleteContactsByIdsInputObject = new DeleteContactsByIdsInputObject(); // DeleteContactsByIdsInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.deleteContactsByIds(deleteContactsByIdsInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteContactsByIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteContactsByIdsInputObject** | [**DeleteContactsByIdsInputObject**](DeleteContactsByIdsInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getBlockedContacts"></a>
# **getBlockedContacts**
> GetBlockedContactsResponse getBlockedContacts(page, limit, query, orderBy, direction)

Get blocked contacts.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String query = "query_example"; // String | Find blocked contacts by specified search query
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
try {
    GetBlockedContactsResponse result = apiInstance.getBlockedContacts(page, limit, query, orderBy, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getBlockedContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **query** | **String**| Find blocked contacts by specified search query | [optional]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, firstName, lastName]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetBlockedContactsResponse**](GetBlockedContactsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContact"></a>
# **getContact**
> Contact getContact(id)

Get a single contact.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
Integer id = 1; // Integer | The contact id
try {
    Contact result = apiInstance.getContact(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The contact id |

### Return type

[**Contact**](Contact.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactByPhone"></a>
# **getContactByPhone**
> Contact getContactByPhone(phone)

Get a single contact by phone number.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = "phone_example"; // String | 
try {
    Contact result = apiInstance.getContactByPhone(phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactByPhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**|  |

### Return type

[**Contact**](Contact.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactIfBlocked"></a>
# **getContactIfBlocked**
> Contact getContactIfBlocked(phone)

Check is that phone number blocked

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String phone = "9997339956475"; // String | Phone number to check
try {
    Contact result = apiInstance.getContactIfBlocked(phone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactIfBlocked");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone** | **String**| Phone number to check |

### Return type

[**Contact**](Contact.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContacts"></a>
# **getContacts**
> GetContactsResponse getContacts(page, limit, shared, orderBy, direction)

Get all user contacts.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
Integer shared = 0; // Integer | Should shared contacts to be included
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
try {
    GetContactsResponse result = apiInstance.getContacts(page, limit, shared, orderBy, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **shared** | **Integer**| Should shared contacts to be included | [optional] [default to 0]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, firstName, lastName]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]

### Return type

[**GetContactsResponse**](GetContactsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactsAutocomplete"></a>
# **getContactsAutocomplete**
> List&lt;GetContactsAutocompleteResponse&gt; getContactsAutocomplete(query, limit, lists)

Get contacts autocomplete suggestions by given search term.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String query = "\"A\""; // String | Find recipients by specified search query
Integer limit = 10; // Integer | How many results to return
Integer lists = 0; // Integer | Should lists be returned or not
try {
    List<GetContactsAutocompleteResponse> result = apiInstance.getContactsAutocomplete(query, limit, lists);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactsAutocomplete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Find recipients by specified search query |
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **lists** | **Integer**| Should lists be returned or not | [optional] [default to 0]

### Return type

[**List&lt;GetContactsAutocompleteResponse&gt;**](GetContactsAutocompleteResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFavourites"></a>
# **getFavourites**
> GetFavouritesResponse getFavourites(page, limit, query)

Get favorite contacts and lists.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
String query = "A"; // String | Find contacts or lists by specified search query
try {
    GetFavouritesResponse result = apiInstance.getFavourites(page, limit, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getFavourites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **query** | **String**| Find contacts or lists by specified search query | [optional] [default to A]

### Return type

[**GetFavouritesResponse**](GetFavouritesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUnsubscribedContact"></a>
# **getUnsubscribedContact**
> UnsubscribedContact getUnsubscribedContact(id)

Get a single unsubscribed contact.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
Integer id = 1; // Integer | 
try {
    UnsubscribedContact result = apiInstance.getUnsubscribedContact(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getUnsubscribedContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**UnsubscribedContact**](UnsubscribedContact.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUnsubscribers"></a>
# **getUnsubscribers**
> GetUnsubscribersResponse getUnsubscribers(page, limit)

Get all contact have unsubscribed from your communication.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
try {
    GetUnsubscribersResponse result = apiInstance.getUnsubscribers(page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getUnsubscribers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]

### Return type

[**GetUnsubscribersResponse**](GetUnsubscribersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchContacts"></a>
# **searchContacts**
> SearchContactsResponse searchContacts(page, limit, shared, ids, listId, includeBlocked, query, local, country, orderBy, direction)

Find user contacts by given parameters.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
Integer page = 1; // Integer | Fetch specified results page
Integer limit = 10; // Integer | How many results to return
Integer shared = 0; // Integer | Should shared contacts to be included
String ids = "ids_example"; // String | Find contact by ID(s)
Integer listId = 56; // Integer | Find contact by List ID
Integer includeBlocked = 56; // Integer | Should blocked contacts to be included
String query = "query_example"; // String | Find contacts by specified search query
Integer local = 0; // Integer | Treat phone number passed in 'query' field as local. Default is 0
String country = "country_example"; // String | 2-letter ISO country code for local phone numbers, used when 'local' is set to true. Default is account country
String orderBy = "id"; // String | Order results by some field. Default is id
String direction = "desc"; // String | Order direction. Default is desc
try {
    SearchContactsResponse result = apiInstance.searchContacts(page, limit, shared, ids, listId, includeBlocked, query, local, country, orderBy, direction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#searchContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Fetch specified results page | [optional] [default to 1]
 **limit** | **Integer**| How many results to return | [optional] [default to 10]
 **shared** | **Integer**| Should shared contacts to be included | [optional] [default to 0]
 **ids** | **String**| Find contact by ID(s) | [optional]
 **listId** | **Integer**| Find contact by List ID | [optional]
 **includeBlocked** | **Integer**| Should blocked contacts to be included | [optional]
 **query** | **String**| Find contacts by specified search query | [optional]
 **local** | **Integer**| Treat phone number passed in &#39;query&#39; field as local. Default is 0 | [optional] [default to 0]
 **country** | **String**| 2-letter ISO country code for local phone numbers, used when &#39;local&#39; is set to true. Default is account country | [optional]
 **orderBy** | **String**| Order results by some field. Default is id | [optional] [default to id] [enum: id, firstName, lastName]
 **direction** | **String**| Order direction. Default is desc | [optional] [default to desc] [enum: asc, desc]

### Return type

[**SearchContactsResponse**](SearchContactsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unblockContact"></a>
# **unblockContact**
> unblockContact(unblockContactInputObject, xIgnoreNullValues)

Unblock contact by phone number.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
UnblockContactInputObject unblockContactInputObject = new UnblockContactInputObject(); // UnblockContactInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.unblockContact(unblockContactInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#unblockContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unblockContactInputObject** | [**UnblockContactInputObject**](UnblockContactInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="unblockContactsBulk"></a>
# **unblockContactsBulk**
> unblockContactsBulk(unblockContactsBulkInputObject, xIgnoreNullValues)

Unblock several contacts by blocked contact ids or unblock all contacts

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
UnblockContactsBulkInputObject unblockContactsBulkInputObject = new UnblockContactsBulkInputObject(); // UnblockContactsBulkInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    apiInstance.unblockContactsBulk(unblockContactsBulkInputObject, xIgnoreNullValues);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#unblockContactsBulk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unblockContactsBulkInputObject** | [**UnblockContactsBulkInputObject**](UnblockContactsBulkInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="unsubscribeContact"></a>
# **unsubscribeContact**
> ResourceLinkResponse unsubscribeContact(unsubscribeContactInputObject, xIgnoreNullValues)

Unsubscribe contact from your communication by phone number.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
UnsubscribeContactInputObject unsubscribeContactInputObject = new UnsubscribeContactInputObject(); // UnsubscribeContactInputObject | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.unsubscribeContact(unsubscribeContactInputObject, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#unsubscribeContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unsubscribeContactInputObject** | [**UnsubscribeContactInputObject**](UnsubscribeContactInputObject.md)|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContact"></a>
# **updateContact**
> ResourceLinkResponse updateContact(updateContactInputObject, id, xIgnoreNullValues)

Update existing contact.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
UpdateContactInputObject updateContactInputObject = new UpdateContactInputObject(); // UpdateContactInputObject | 
Integer id = 1; // Integer | 
Boolean xIgnoreNullValues = true; // Boolean | 
try {
    ResourceLinkResponse result = apiInstance.updateContact(updateContactInputObject, id, xIgnoreNullValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#updateContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateContactInputObject** | [**UpdateContactInputObject**](UpdateContactInputObject.md)|  |
 **id** | **Integer**|  |
 **xIgnoreNullValues** | **Boolean**|  | [optional] [default to true]

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadContactAvatar"></a>
# **uploadContactAvatar**
> ResourceLinkResponse uploadContactAvatar(image, id)

Add an avatar for the contact.

### Example
```java
// Import classes:
//import com.textmagic.sdk.ApiClient;
//import com.textmagic.sdk.ApiException;
//import com.textmagic.sdk.Configuration;
//import com.textmagic.sdk.auth.*;
//import com.textmagic.sdk.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
File image = new File("/path/to/file.txt"); // File | Contact avatar. Should be PNG or JPG file not more than 10 MB
Integer id = 56; // Integer | 
try {
    ResourceLinkResponse result = apiInstance.uploadContactAvatar(image, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#uploadContactAvatar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**| Contact avatar. Should be PNG or JPG file not more than 10 MB |
 **id** | **Integer**|  |

### Return type

[**ResourceLinkResponse**](ResourceLinkResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

