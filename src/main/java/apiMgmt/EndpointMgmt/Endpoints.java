package apiMgmt.EndpointMgmt;
public enum Endpoints {
    // Chats
    getUserChatList,
    getAvailableUsers,
    createOneOnOneChat,
    deleteOneOnOneChat,

    // Group Chats
    createGroupChat,
    getGroupChatDetails,
    deleteGroupChat,
    updateGroupChatName,
    addParticipant,
    removeParticipant,
    leaveGroupChat,

    // Messages
    getAllMessages,
    sendMessage,
    deleteMessage,

    //Authentication
    register,
    login,
    logout

}
