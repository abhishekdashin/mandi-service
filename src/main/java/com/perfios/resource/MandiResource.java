package com.perfios.resource;

import com.perfios.dto.Result;
import com.perfios.exception.ExceptionResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "mandi", description = "Mandi resource")
@RequestMapping(value = "/api/v1/mandi")
public class MandiResource {
    @RequestMapping(path = "/prices", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get government prices for commodities",
                  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    @ApiResponses({@ApiResponse(code = 200, message = "Success", response = Result.class),
                   @ApiResponse(code = 500, message = "Internal Server error", response = ExceptionResponse.class),
                   @ApiResponse(code = 400, message = "Bad request", response = ExceptionResponse.class)})
    public ResponseEntity<Result> getCurrentPrices(@RequestParam(defaultValue = "0") String offset) {
        final String uri = "https://api.data.gov.in/resource/9ef84268-d588-465a-a308-a864a43d0070?api-key" +
                           "=579b464db66ec23bdd000001cdd3946e44ce4aad7209ff7b23ac571b&format=xml&offset="
                           + offset + "&limit=10";

        RestTemplate restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType
                .APPLICATION_OCTET_STREAM));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
        Result result = restTemplate.getForObject(uri, Result.class);
        return ResponseEntity.ok(result);
    }
}
