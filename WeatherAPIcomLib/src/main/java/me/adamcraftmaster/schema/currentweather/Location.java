/*
   Copyright 2022 Adam Nativ

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package me.adamcraftmaster.schema.currentweather;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "name",
  "region",
  "country",
  "lat",
  "lon",
  "tz_id",
  "localtime_epoch",
  "localtime"
})
@Generated("jsonschema2pojo")
public class Location {

  @JsonProperty("name")
  private String name;

  @JsonProperty("region")
  private String region;

  @JsonProperty("country")
  private String country;

  @JsonProperty("lat")
  private Double lat;

  @JsonProperty("lon")
  private Double lon;

  @JsonProperty("tz_id")
  private String tzId;

  @JsonProperty("localtime_epoch")
  private Integer localtimeEpoch;

  @JsonProperty("localtime")
  private String localtime;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public Location withName(String name) {
    this.name = name;
    return this;
  }

  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  @JsonProperty("region")
  public void setRegion(String region) {
    this.region = region;
  }

  public Location withRegion(String region) {
    this.region = region;
    return this;
  }

  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  public Location withCountry(String country) {
    this.country = country;
    return this;
  }

  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  @JsonProperty("lat")
  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Location withLat(Double lat) {
    this.lat = lat;
    return this;
  }

  @JsonProperty("lon")
  public Double getLon() {
    return lon;
  }

  @JsonProperty("lon")
  public void setLon(Double lon) {
    this.lon = lon;
  }

  public Location withLon(Double lon) {
    this.lon = lon;
    return this;
  }

  @JsonProperty("tz_id")
  public String getTzId() {
    return tzId;
  }

  @JsonProperty("tz_id")
  public void setTzId(String tzId) {
    this.tzId = tzId;
  }

  public Location withTzId(String tzId) {
    this.tzId = tzId;
    return this;
  }

  @JsonProperty("localtime_epoch")
  public Integer getLocaltimeEpoch() {
    return localtimeEpoch;
  }

  @JsonProperty("localtime_epoch")
  public void setLocaltimeEpoch(Integer localtimeEpoch) {
    this.localtimeEpoch = localtimeEpoch;
  }

  public Location withLocaltimeEpoch(Integer localtimeEpoch) {
    this.localtimeEpoch = localtimeEpoch;
    return this;
  }

  @JsonProperty("localtime")
  public String getLocaltime() {
    return localtime;
  }

  @JsonProperty("localtime")
  public void setLocaltime(String localtime) {
    this.localtime = localtime;
  }

  public Location withLocaltime(String localtime) {
    this.localtime = localtime;
    return this;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  public Location withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }
}
