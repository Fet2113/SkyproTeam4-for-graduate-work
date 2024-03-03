package ru.skypro.homework.service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPassword;
import ru.skypro.homework.dto.UpdateUser;
import ru.skypro.homework.model.User;

/**
 * Service for working with users.
 */
public interface UserService {
    /**
     * Updates the password of the current user.
     *
     * @param dto current password and new password
     * @return updated user
     */
    User updatePassword(NewPassword dto);

    /**
     * Returns the current user.
     *
     * @return the current user
     */
    User getMe();

    /**
     * Updates the current user.
     *
     * @param dto new information
     * @return updated user
     */
    User updateMe(UpdateUser dto);

    /**
     * Updates the image of the current user.
     *
     * @param imageFile image file
     * @return updated user
     */
    User updateMyImage(MultipartFile imageFile);
}

