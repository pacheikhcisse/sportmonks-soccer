package com.sportmonks.data.entity;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "code", "icon", "type", "wind", "clouds", "humidity", "temperature" })
@EqualsAndHashCode
@ToString
public class WeatherReport {

	@JsonProperty("code")
	private String code;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("type")
	private String type;
	@JsonProperty("wind")
	private Wind wind;
	@JsonProperty("clouds")
	private String clouds;
	@JsonProperty("humidity")
	private String humidity;
	@JsonProperty("temperature")
	private Temperature temperature;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("icon")
	public String getIcon() {
		return icon;
	}

	@JsonProperty("icon")
	public void setIcon(String icon) {
		this.icon = icon;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("wind")
	public Wind getWind() {
		return wind;
	}

	@JsonProperty("wind")
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	@JsonProperty("clouds")
	public String getClouds() {
		return clouds;
	}

	@JsonProperty("clouds")
	public void setClouds(String clouds) {
		this.clouds = clouds;
	}

	@JsonProperty("humidity")
	public String getHumidity() {
		return humidity;
	}

	@JsonProperty("humidity")
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	@JsonProperty("temperature")
	public Temperature getTemperature() {
		return temperature;
	}

	@JsonProperty("temperature")
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		WeatherReport that = (WeatherReport) o;

		if (code != null ? !code.equals(that.code) : that.code != null) {
			return false;
		}
		if (icon != null ? !icon.equals(that.icon) : that.icon != null) {
			return false;
		}
		if (type != null ? !type.equals(that.type) : that.type != null) {
			return false;
		}
		if (wind != null ? !wind.equals(that.wind) : that.wind != null) {
			return false;
		}
		if (clouds != null ? !clouds.equals(that.clouds) : that.clouds != null) {
			return false;
		}
		if (humidity != null ? !humidity.equals(that.humidity) : that.humidity != null) {
			return false;
		}
		if (temperature != null ? !temperature.equals(that.temperature) : that.temperature != null) {
			return false;
		}
		return additionalProperties != null ? additionalProperties
				.equals(that.additionalProperties) : that.additionalProperties == null;
	}

	@Override
	public int hashCode() {
		int result = code != null ? code.hashCode() : 0;
		result = 31 * result + (icon != null ? icon.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (wind != null ? wind.hashCode() : 0);
		result = 31 * result + (clouds != null ? clouds.hashCode() : 0);
		result = 31 * result + (humidity != null ? humidity.hashCode() : 0);
		result = 31 * result + (temperature != null ? temperature.hashCode() : 0);
		result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
		return result;
	}
}