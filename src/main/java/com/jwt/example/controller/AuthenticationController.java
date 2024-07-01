package com.jwt.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.dto.JwtAuthenticationResponse;
import com.jwt.example.dto.RefreshTokenRequest;
import com.jwt.example.dto.SignInRequest;
import com.jwt.example.dto.SignUpRequest;
import com.jwt.example.entity.User;
import com.jwt.example.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController
{
    @Autowired
    private final AuthenticationService authenticationService;

    @PostMapping("/user/signup")
    public User signUp(@RequestBody SignUpRequest signUpRequest){
        return authenticationService.signUp(signUpRequest);
    }

    @PostMapping("/admin/signup")
    public User adminSignUp(@RequestBody SignUpRequest signUpRequest){
        return authenticationService.adminSignUp(signUpRequest);
    }
    @PostMapping("/login")
    public JwtAuthenticationResponse login(@RequestBody SignInRequest signInRequest){
        return authenticationService.signIn(signInRequest);
    }
    @PostMapping("/hr/signup")
  public User hrSignUp(@RequestBody SignUpRequest signUpRequest){
      return authenticationService.signUp(signUpRequest);
      }



    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }
    }
