package com.bookstore.manager.model.author.controller;

import com.bookstore.manager.model.author.dto.AuthorDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Api("Authors management")
public interface AuthorControllerDocs {
    @ApiOperation(value="Author creation operation")
    @ApiResponses(value={ @ApiResponse(code = 201, message = "Success author duration"),@ApiResponse(code=400, message = "Missing required fileds, wrong field range value or author already exists")})
    AuthorDTO create(@RequestBody @Valid AuthorDTO authorDTO);
}
