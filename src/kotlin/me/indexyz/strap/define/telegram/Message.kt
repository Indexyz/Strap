package me.indexyz.strap.define.telegram

data class Message (
    val message_id: Long,
    val from: User?,
    val date: Long,
    val chat: Chat,
    val forward_from: User?,
    val forward_from_chat: Chat?,
    val forward_from_message_id: Long?,
    val forward_signature: String?,
    val forward_date: Long?,
    val reply_to_message: Message?,
    val edit_date: Long?,
    val media_group_id: String?,
    val author_signature: String?,
    val text: String?,
    val entities: List<MessageEntity>?,
    val caption_entities: List<MessageEntity>?,
    val audio: Audio?,
    val document: Document?,
    val animation: Animation?,
    val game: Game?,
    val photo: List<PhotoSize>?,
    val sticker: Sticker?,
    val video: Video?,
    val voice: Voice?,
    val video_note: VideoNote?,
    val caption: String?,
    val contact: Contact?,
    val location: Location?,
    val venue: Venue?,
    val new_chat_members: List<User>?,
    val left_chat_member: User?,
    val new_chat_title: String?,
    val new_chat_photo: List<PhotoSize>?,
    val delete_chat_photo: Boolean?,
    val group_chat_created: Boolean?,
    val supergroup_chat_created: Boolean?,
    val channel_chat_created: Boolean?,
    val migrate_to_chat_id: Long?,
    val migrate_from_chat_id: Long?,
    val pinned_message: Message?,
    val invoice: Invoice?,
    val successful_payment: SuccessfulPayment?,
    val connected_website: String?,
    val passport_data: PassportData?
)