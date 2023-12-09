package com.algocrafters.demos.spring.app.api;

import com.algocrafters.demos.spring.app.model.AppInfo;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Provides a collection of API endpoints for application maintenance.
 *
 * @author vitali.tchalov@algocrafters.com
 * @since 0.1
 */
@RestController
@RequestMapping(value = {"/v1"}, produces = {MediaType.APPLICATION_JSON_VALUE})
public class AppMaintenanceController {

    /**
     * An API endpoint to get basic application information.
     * <p>
     * Access Control:
     * public API
     * </p>
     * @return a {@link AppInfo} object.
     * @since v0.1
     */
    @GetMapping(value = "/public/appinfo")
    public ResponseEntity<AppInfo> getAppInfo() {
            return ResponseEntity.ok(new AppInfo("v0.1", DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now())));
    }

}
