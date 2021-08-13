package com.murilonerdx.bookmanager.model.user.controller.docs;

import com.murilonerdx.bookmanager.model.user.dto.MessageDTO;
import com.murilonerdx.bookmanager.model.user.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Api("System users management")
public interface UserControllerDocs {
    @ApiOperation(value = "Delete update operation")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Success user deletion"),
            @ApiResponse(code = 404, message = "User with informed ID not found in the system")
    })
    void delete(Long id);
}
