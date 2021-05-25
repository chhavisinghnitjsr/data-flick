package org.dataflick.controller;

import org.dataflick.controller.request.JobRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap/v1/")
public class JobController {

    @PostMapping("/submit_jobs")
    public void submitJob(@RequestBody JobRequest jobRequest) {

    }
}
