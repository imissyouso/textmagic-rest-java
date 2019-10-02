
# MessageSession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Session ID. | 
**startTime** | **String** | Session creation time. | 
**text** | **String** | Session text. If a template was used for the session text (see [Messages: Send](#tag/Outbound-Messages) for details), it may contain template tags.  | 
**source** | **String** | *   **O** for TextMagic Online *   **A** for API *   **M** for TextMagic Messenger *   **E** for [Email to SMS](/docs/api/send-email-to-sms/) *   **X** for [Distribution lists](/docs/api/distribution-lists/)  | 
**referenceId** | **String** | Custom reference ID (see [Messages: Send](/docs/api/send-sms/) for details).  | 
**price** | [**BigDecimal**](BigDecimal.md) | Session cost (in account currency). | 
**numbersCount** | **Integer** | Session recipient count. | 
**destination** | **String** |  | 



