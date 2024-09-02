package main;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.TextAlignment;

public class DialogBox extends HBox {

    private Label text;
    private ImageView displayPicture;
    private boolean isUser;

    public DialogBox(String s, Image i, boolean isUser) {
        this.text = new Label(s);
        this.displayPicture = new ImageView(i);

        // Styling the dialog box
        text.setWrapText(true);
        text.setTextAlignment(TextAlignment.LEFT);
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);

        Region spacer = new Region();
        spacer.setMinWidth(10);

        if (isUser) {
            this.setAlignment(Pos.TOP_RIGHT);
            this.getChildren().addAll(text, spacer, displayPicture);
        } else {
            this.setAlignment(Pos.TOP_LEFT);
            this.getChildren().addAll(displayPicture, spacer, text);
        }
    }

    /**
     * Factory method to create a dialog box for user input (right side).
     *
     * @param text The text input by the user.
     * @param img The image to display.
     * @return A dialog box containing the user input.
     */
    public static DialogBox getUserDialog(String text, Image img) {
        return new DialogBox(text, img, true);
    }

    /**
     * Factory method to create a dialog box for bot response (left side).
     *
     * @param text The text input by the bot.
     * @param img The image to display.
     * @return A dialog box containing the bot response.
     */
    public static DialogBox getProYapperDialog(String text, Image img) {
        return new DialogBox(text, img, false);
    }
}

