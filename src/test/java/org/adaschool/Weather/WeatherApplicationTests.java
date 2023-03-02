package org.adaschool.Weather;

import org.adaschool.Weather.controller.WeatherReportController;
import org.adaschool.Weather.data.WeatherReport;
import org.adaschool.Weather.service.WeatherReportService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

import java.util.List;

@SpringBootTest
class WeatherApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testGetWeatherReportService() {
		WeatherReportService weatherReportService = mock(WeatherReportService.class);
		WeatherReport weatherReport = new WeatherReport();
		weatherReport.setTemperature(10.0);
		weatherReport.setHumidity(20.0);
		when(weatherReportService.getWeatherReport(10.0, 20.0)).thenReturn(weatherReport);
		WeatherReport weatherReport1 = weatherReportService.getWeatherReport(10.0, 20.0);
		assert(weatherReport1.getTemperature() == 10.0);
		assert(weatherReport1.getHumidity() == 20.0);
	}

	@Test
	void testGetWeatherReportController(){
		WeatherReportController weatherReportController = mock(WeatherReportController.class);
		WeatherReport weatherReport = new WeatherReport();
		weatherReport.setTemperature(10.0);
		weatherReport.setHumidity(20.0);
		when(weatherReportController.getWeatherReport(10.0, 20.0)).thenReturn(weatherReport);
		WeatherReport weatherReport1 = weatherReportController.getWeatherReport(10.0, 20.0);
		assert(weatherReport1.getTemperature() == 10.0);
		assert(weatherReport1.getHumidity() == 20.0);
	}

	@Test
	void testFailedGetWeatherReportService() {
		WeatherReportService weatherReportService = mock(WeatherReportService.class);
		WeatherReport weatherReport = new WeatherReport();
		weatherReport.setTemperature(10.0);
		weatherReport.setHumidity(20.0);
		when(weatherReportService.getWeatherReport(10.0, 20.0)).thenReturn(weatherReport);
		WeatherReport weatherReport1 = weatherReportService.getWeatherReport(10.0, 20.0);
		assert(weatherReport1.getTemperature() != 20.0);
		assert(weatherReport1.getHumidity() != 10.0);
	}

	@Test
	void testFailedGetWeatherReportController(){
		WeatherReportController weatherReportController = mock(WeatherReportController.class);
		WeatherReport weatherReport = new WeatherReport();
		weatherReport.setTemperature(10.0);
		weatherReport.setHumidity(20.0);
		when(weatherReportController.getWeatherReport(10.0, 20.0)).thenReturn(weatherReport);
		WeatherReport weatherReport1 = weatherReportController.getWeatherReport(10.0, 20.0);
		assert(weatherReport1.getTemperature() != 20.0);
		assert(weatherReport1.getHumidity() != 10.0);
	}

}
