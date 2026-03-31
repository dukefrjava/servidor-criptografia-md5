package com.example.criptografiaMD5.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import jakarta.xml.bind.DatatypeConverter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/md5")
public class Criptografia implements ICriptografia {

    @GetMapping("/{palavra}")
    public String gerarMD5(@PathVariable("palavra") String chave) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(chave.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest).toUpperCase();
    }
}