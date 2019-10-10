
# MessagesIcs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Schedule ID. | 
**nextSend** | [**OffsetDateTime**](OffsetDateTime.md) | Next send date in [ISO 8601](https://en.wikipedia.org/?title&#x3D;ISO_8601) format.  | 
**rrule** | **String** | [iCal RRULE](http://www.kanzaki.com/docs/ical/rrule.html) string.  | 
**session** | [**MessageSession**](MessageSession.md) |  | 
**lastSent** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when last message has been sent. | 
**contactName** | **String** |  | 
**parameters** | [**MessagesIcsParameters**](MessagesIcsParameters.md) |  | 
**type** | **String** |  | 
**summary** | **String** |  | 
**textParameters** | [**MessagesIcsTextParameters**](MessagesIcsTextParameters.md) |  | 
**firstOccurrence** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**lastOccurrence** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**recipientsCount** | **Integer** | Amount of actual recipients. | 
**timezone** | **String** | User-friendly timezone name (with spaces replaced by underscores). | 
**completed** | **Boolean** | Indicates that schedling has been completed. | 
**avatar** | **String** | null | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Scheduling creation time. | 



