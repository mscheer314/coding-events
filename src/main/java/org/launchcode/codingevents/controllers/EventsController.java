package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventsController {
    private static HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
//        model.addAttribute("events", events);
//        return "events/index";
        events.put("Pouring Coffee into the Matrix - Building Java Applications on Neo4j",
                "Many of us have built applications for traditional data structures (like relational database tables), but is it different for graph data stores? In this session, we will cover a brief intro to graphs and build a typical Java application for a graph database. We will interact with the graph data from the application, and explore some deployment possibilities. Join us to see how to amplify the power of connected data with applications!");
        events.put("Azure DevOps for .Net- Fall into the Pit of Success with Jeffrey Palermo",
                "Azure DevOps Services and all of the automation involved for a complete DevOps environment can be daunting. In this talk, Jeffrey Palermo provides prescriptive guidance for developers to fall into the \"pit of success\" when creating automated DevOps pipelines for complex .NET apps targeting Azure.");
        events.put("Machine Learning for Beginners: Decision Trees",
                "Join us for a machine learning class designed for beginners! This class is free and open to the public. We will start with the basic overview of machine learning concepts and then dig into the details. The class will be taught using Python but will focus on machine learning concepts more than coding.\n" +
                        "\n" +
                        "In this class we will cover the basics of decision and regression trees and their use in predictive " +
                        "modeling. If time permits we will begin our discussion of ensemble methods using decision trees by covering the concepts of boosting and bagging.");

        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, @RequestParam String eventDescription) {
        events.put(eventName, eventDescription);
        return "redirect:";
    }
}
