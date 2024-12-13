package com.eazybytes.accounts.dto;

import com.eazybytes.accounts.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
public class AccountsDto{

    private Long accountNumber;

    private String accountType;

    private String branchAddress;




}
