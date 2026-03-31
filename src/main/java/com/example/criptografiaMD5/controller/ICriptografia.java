package com.example.criptografiaMD5.controller;

import java.security.NoSuchAlgorithmException;

public interface ICriptografia {
    String gerarMD5(String chave) throws NoSuchAlgorithmException;
}