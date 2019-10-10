/*
 * TextMagic API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.textmagic.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateChatDesktopNotificationSettingsInputObject
 */

public class UpdateChatDesktopNotificationSettingsInputObject {
  @SerializedName("playSound")
  private Boolean playSound = null;

  @SerializedName("showNotifications")
  private Boolean showNotifications = null;

  @SerializedName("showText")
  private Boolean showText = null;

  @SerializedName("soundId")
  private Integer soundId = null;

  public UpdateChatDesktopNotificationSettingsInputObject playSound(Boolean playSound) {
    this.playSound = playSound;
    return this;
  }

   /**
   * Enable notification sound?
   * @return playSound
  **/
  @ApiModelProperty(example = "false", required = true, value = "Enable notification sound?")
  public Boolean isPlaySound() {
    return playSound;
  }

  public void setPlaySound(Boolean playSound) {
    this.playSound = playSound;
  }

  public UpdateChatDesktopNotificationSettingsInputObject showNotifications(Boolean showNotifications) {
    this.showNotifications = showNotifications;
    return this;
  }

   /**
   * Show desktop notifications about new messages.
   * @return showNotifications
  **/
  @ApiModelProperty(example = "false", required = true, value = "Show desktop notifications about new messages.")
  public Boolean isShowNotifications() {
    return showNotifications;
  }

  public void setShowNotifications(Boolean showNotifications) {
    this.showNotifications = showNotifications;
  }

  public UpdateChatDesktopNotificationSettingsInputObject showText(Boolean showText) {
    this.showText = showText;
    return this;
  }

   /**
   * Incoming message text will be displayed in desktop notifications.
   * @return showText
  **/
  @ApiModelProperty(example = "true", value = "Incoming message text will be displayed in desktop notifications.")
  public Boolean isShowText() {
    return showText;
  }

  public void setShowText(Boolean showText) {
    this.showText = showText;
  }

  public UpdateChatDesktopNotificationSettingsInputObject soundId(Integer soundId) {
    this.soundId = soundId;
    return this;
  }

   /**
   * Sound Id of a notification.
   * @return soundId
  **/
  @ApiModelProperty(example = "23", value = "Sound Id of a notification.")
  public Integer getSoundId() {
    return soundId;
  }

  public void setSoundId(Integer soundId) {
    this.soundId = soundId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateChatDesktopNotificationSettingsInputObject updateChatDesktopNotificationSettingsInputObject = (UpdateChatDesktopNotificationSettingsInputObject) o;
    return Objects.equals(this.playSound, updateChatDesktopNotificationSettingsInputObject.playSound) &&
        Objects.equals(this.showNotifications, updateChatDesktopNotificationSettingsInputObject.showNotifications) &&
        Objects.equals(this.showText, updateChatDesktopNotificationSettingsInputObject.showText) &&
        Objects.equals(this.soundId, updateChatDesktopNotificationSettingsInputObject.soundId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playSound, showNotifications, showText, soundId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChatDesktopNotificationSettingsInputObject {\n");
    
    sb.append("    playSound: ").append(toIndentedString(playSound)).append("\n");
    sb.append("    showNotifications: ").append(toIndentedString(showNotifications)).append("\n");
    sb.append("    showText: ").append(toIndentedString(showText)).append("\n");
    sb.append("    soundId: ").append(toIndentedString(soundId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

