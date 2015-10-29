/*
 * Copyright (C) 2005-2012 Alfresco Software Limited.
 * This file is part of Alfresco
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.po.share.site.document;

import org.openqa.selenium.By;

/**
 * @author Aliaksei Boole
 */
public class EditCommentForm extends AbstractCommentForm
{
    private final static String FORM_DIV_CSS = "DIV[class='comments-list']>DIV[class='comment-form']";
    private final static By FORM_DIV = By.cssSelector(FORM_DIV_CSS);
    private final static By AVATAR = By.cssSelector(FORM_DIV_CSS + ">img");
    private final static By CANCEL_BUTTON = By.cssSelector(FORM_DIV_CSS + " span[class~='yui-reset-button']>span>button");
    public final static By SUBMIT_BUTTON = By.cssSelector(FORM_DIV_CSS + " span[class~='yui-submit-button']>span>button");


    public void clickSaveCommentButton()
    {
        click(SUBMIT_BUTTON);
    }

    public void clickCancelButton()
    {
        click(CANCEL_BUTTON);
    }

    public boolean isDisplay()
    {
        return isElementDisplayed(FORM_DIV);
    }

    public boolean isAvatarDisplay()
    {
        return isElementDisplayed(AVATAR);
    }

    public boolean isButtonsEnable()
    {
        return super.isButtonsEnable(SUBMIT_BUTTON, CANCEL_BUTTON);
    }
}