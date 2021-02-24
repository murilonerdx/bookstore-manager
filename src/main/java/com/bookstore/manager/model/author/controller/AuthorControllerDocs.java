package com.bookstore.manager.model.author.controller;

import com.bookstore.manager.model.author.dto.AuthorDTO;
import com.bookstore.manager.model.author.exception.AuthorAlreadyExistsException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Api("Authors management")
public interface AuthorControllerDocs {
    @ApiOperation(value="Author insert")
    @ApiResponses(value={ @ApiResponse(code = 201, message = "Success author duration"),@ApiResponse(code=400, message = "Missing required fileds, wrong field range value or author already exists")})
    AuthorDTO create(@RequestBody @Valid AuthorDTO authorDTO) throws AuthorAlreadyExistsException;
    @ApiOperation(value="Author findById")
    @ApiResponses(value={ @ApiResponse(code = 201, message = "Success author duration"),@ApiResponse(code=400, message = "Missing required fileds, wrong field range value or author already exists")})
    AuthorDTO findById(@PathVariable Long id);
    @ApiOperation(value="Authors findAll")
    @ApiResponses(value={ @ApiResponse(code = 201, message = "Success author duration"),@ApiResponse(code=400, message = "Not found element")})
    List<AuthorDTO> findAll();
    @ApiOperation(value="Authors delete")
    @ApiResponses(value={ @ApiResponse(code = 201, message = "Success author duration"),@ApiResponse(code=400, message = "Not found element")})
    void delete(@PathVariable Long id);
}
