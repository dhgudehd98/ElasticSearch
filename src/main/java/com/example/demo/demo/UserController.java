package com.example.demo.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserDocumentRepository userDocumentRepository;

    @PostMapping("")
    @ResponseBody
    public UserDocument createUser(
            @RequestBody UserCreateRequestDto userCreateRequestDto
    ) {
        UserDocument user = new UserDocument(
                userCreateRequestDto.getId(),
                userCreateRequestDto.getName(),
                userCreateRequestDto.getAge(),
                userCreateRequestDto.getActive()
        );
        userDocumentRepository.save(user);

        return user;
    }

    @GetMapping("{id}")
    @ResponseBody
    public UserDocument getUser(
            @PathVariable String id
    ) {
        UserDocument user = userDocumentRepository.findById(id).orElseThrow(() -> new RuntimeException("존재하지 않는 유저입니다."));

        return user;
    }

    @PutMapping("{id}")
    @ResponseBody
    public UserDocument updateUser(
            @PathVariable String id,
            @RequestBody UserUpdateRequestDto userUpdateRequestDto
    ){
        UserDocument user = userDocumentRepository.findById(id).orElseThrow(() -> new RuntimeException("존재하지 않는 유저입니다."));

        user.setName(userUpdateRequestDto.getName());
        user.setAge(userUpdateRequestDto.getAge());
        user.setIsActive(userUpdateRequestDto.getActive());

        userDocumentRepository.save(user);

        return user;
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public void deleteUser(@PathVariable String id) {
        UserDocument user = userDocumentRepository.findById(id).orElseThrow(() -> new RuntimeException("존재하지 않는 아이디입니다."));

        userDocumentRepository.delete(user);
    }
}