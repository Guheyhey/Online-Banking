package com.joegl.controller;

import com.joegl.domain.*;
import com.joegl.service.AppointmentService;
import com.joegl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String createAppointment(Model model) {
        Appointment appointment = new Appointment();

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date date = new Date();
        String currentDate = format1.format(date);

        model.addAttribute("appointment", appointment);
        model.addAttribute("dateString", "");
        model.addAttribute("currentDate", currentDate);

        return "appointment";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String createAppointmentPost(
            @ModelAttribute("appointment") Appointment appointment,
            @ModelAttribute("dateString") String date,
            Model model,
            Principal principal
    ) throws ParseException {

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date d1 = format1.parse( date );
        appointment.setDate(d1);

        User user = userService.findByUsername(principal.getName());
        appointment.setUser(user);

        appointmentService.createAppointment(appointment);

        return "redirect:/userFront";
    }


}